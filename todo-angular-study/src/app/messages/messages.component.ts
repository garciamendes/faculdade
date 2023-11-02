import { Component } from '@angular/core';
import { MessageService } from './messages.services';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.scss']
})
export class MessagesComponent {
  constructor(
    public messageService: MessageService
  ) {}
}
