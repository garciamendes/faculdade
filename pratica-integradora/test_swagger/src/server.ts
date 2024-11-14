import fastify, { FastifyReply, FastifyRequest } from "fastify";
import swagger from "@fastify/swagger";
import swaggerUI from "@fastify/swagger-ui";
import { userSchema } from "./constants";

const app = fastify();

const tags = [{ name: "user" }];

app.register(swagger, {
  swagger: {
    info: {
      title: "API de Usuários",
      description: "API para criação e gerenciamento de usuários",
      version: "1.0.0",
    },
    host: "localhost:3000",
    schemes: ["http"],
    consumes: ["application/json"],
    produces: ["application/json"],
    tags: tags,
  },
});
app.register(swaggerUI, {
  routePrefix: "/documentation", // Prefixo da UI do Swagger
  uiConfig: {
    docExpansion: "full",
    deepLinking: false,
  },
  staticCSP: true,
  transformStaticCSP: (header) => header,
  transformSpecification: (swaggerObject) => swaggerObject,
  transformSpecificationClone: true,
});

app.register((app, options, done) => {
  app.post(
    "/api/user",
    {
      schema: {
        ...userSchema,
        description: "Cria um novo usuário com nome e email",
      },
    },
    async (request: FastifyRequest, reply: FastifyReply) => {
      const { name, email } = request.body as { name: string; email: string };

      if (!name || !email) {
        return reply.status(400).send({ error: "Missing required fields" });
      }

      if (!/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/.test(email)) {
        return reply.status(400).send({ error: "Invalid email format" });
      }

      return reply.status(201).send();
    }
  );

  done();
});

app
  .listen({
    host: "0.0.0.0",
    port: 3000,
  })
  .then(() => {
    console.log("HTTP Server Running 🚀");
  });
