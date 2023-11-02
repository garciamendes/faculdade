import { Component, Input, NgModule, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { TodoService } from './services/todos/todo.service';
import { ITask } from './services/todos/types';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  items: ITask[] = []

  constructor(
    private todoService: TodoService
  ) {}

  ngOnInit(): void {
    this.getTasks()
  }

  getTasks(): void {
    this.todoService.getTasks()
      .subscribe(tasks => this.items = tasks)
  }

  @Input() task = ''

  addItem(task: string): void {
    this.todoService.newItem(task)
    this.task = ''
  }
}
