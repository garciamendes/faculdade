import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TodoService } from './services/todos/todo.service';
import { FormsModule } from '@angular/forms';
import { MessagesComponent } from './messages/messages.component';
import { MessageService } from './messages/messages.services';

@NgModule({
  declarations: [
    AppComponent,
    MessagesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    TodoService,
    MessageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
