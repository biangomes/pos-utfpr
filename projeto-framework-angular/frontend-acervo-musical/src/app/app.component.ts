import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  ultimoId = 0;
  nome = '';
  adicionado = false;
  cantores: Cantor[] = [];

  adicionar() {
    this.adicionado = true;
    this.cantores.push({
      id: ++this.ultimoId,
      nome: this.nome
    });
  }  
}

interface Cantor {
  id: number;
  nome: string;
}