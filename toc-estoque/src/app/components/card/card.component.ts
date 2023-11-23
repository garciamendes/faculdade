import { Component, Input } from '@angular/core';
import { IProduct } from '../stock/stock.component';

export interface ICard {
  title: string
  image: string
  amountStock: number
  starAmount?: number
}

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent {
  @Input() product: Partial<IProduct> = {}
}
