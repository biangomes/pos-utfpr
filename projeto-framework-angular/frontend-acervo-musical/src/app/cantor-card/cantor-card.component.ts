import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cantor-card',
  templateUrl: './cantor-card.component.html',
  // styleUrls: ['./cantor-card.component.css']
  styles: [`
    .card-block {
      text-transform: uppercase;
      color: blue;
    }
  `]
})
export class CantorCardComponent {

  @Input() cantor: any;
  
  getEstilosCard() {
    return  {
      'border-width': this.cantor.id + 'px',
      'background-color': this.cantor.id % 2 === 0 ? 'lightblue' : 'lightgreen'
    };
  }
}