import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-cantor-form',
  templateUrl: './cantor-form.component.html',
  styleUrls: ['./cantor-form.component.css']
})
export class CantorFormComponent {
  ultimoId = 0;
  nome = '';
  adicionado = false;
  @Output() cantorAdicionado = new EventEmitter();

  adicionar() {
    this.adicionado = true;

    const cantor = {
      id: ++this.ultimoId,
      nome: this.nome
    };
    this.cantorAdicionado.emit(cantor);
  }  
}
