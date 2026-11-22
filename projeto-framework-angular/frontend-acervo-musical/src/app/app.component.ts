import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nome = '';
  nomeInserido = 'Beatriz';

  adicionar(nome: string) {
    this.nomeInserido = nome;
    this.nome = '';
  }

  alterarNome(event: any) {
    this.nome = event.target.value;
  }
}
