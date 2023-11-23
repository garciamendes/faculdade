import { Component, EventEmitter, Input, Output } from '@angular/core';

export interface IProduct {
  id?: string
  title: string
  image: string
  amountStock: number
  starAmount?: number
}

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.scss']
})
export class StockComponent {
  products: IProduct[] = [
    {
      id: '1',
      title: 'Plastation 5',
      image: 'https://images.unsplash.com/photo-1606144042614-b2417e99c4e3?w=400&h=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHMlMjA1fGVufDB8fDB8fHww',
      amountStock: 5,
      starAmount: 4.3
    },
    {
      id: '2',
      title: 'Xbox Serie X',
      image: 'https://images.unsplash.com/photo-1683823362932-6f7599661d22?w=400&h=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fHhib3glMjBzZXJpZXMlMjB4fGVufDB8MXwwfHx8MA%3D%3D',
      amountStock: 10,
      starAmount: 3
    },
  ]

  @Input() product: IProduct | null = null
  @Output() editProduct = new EventEmitter<IProduct>()

  // constructor(private dialog: MatDialog)
  newProduct(): void {

  }
}
