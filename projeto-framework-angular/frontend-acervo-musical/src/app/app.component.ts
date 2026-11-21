import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nome = 'Beatriz';

  adicionar(nome: string) {
    this.nome = nome;
    console.log(nome);
  }
}
