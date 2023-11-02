import { Injectable } from '@angular/core';
import { ITask } from './types';
import { Observable, of } from 'rxjs';
import { MessageService } from 'src/app/messages/messages.services';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  tasks: ITask[] = [
    { title: 'teste 1', isFinished: false },
    { title: 'teste 1', isFinished: true },
  ];

  constructor(
    private messageService: MessageService
  ) { }

  newItem(task: string): void {
    this.tasks.push({ title: task, isFinished: false })
    this.messageService.add(`User ${task}, criado com sucesso`)
  }

  getTasks(): Observable<ITask[]> {
    const tasks = of(this.tasks)

    this.messageService.add('Sucesso ao listar')
    return tasks
  }
}
