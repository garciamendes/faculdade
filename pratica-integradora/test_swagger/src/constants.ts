export const userSchema = {
  body: {
    type: "object",
    required: ["name", "email"],
    properties: {
      name: { type: "string" },
      email: { type: "string", format: "email" },
    },
  },
  response: {
    201: {
      description: "Usuário criado com sucesso",
      type: "object",
      properties: {
        message: { type: "string" },
      },
    },
    400: {
      description: "Erro de validação",
      type: "object",
      properties: {
        error: { type: "string" },
      },
    },
  },
  tags: ["user"], // Adiciona a categoria da rota
};
