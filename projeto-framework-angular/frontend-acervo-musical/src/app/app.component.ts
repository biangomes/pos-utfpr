import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  cantores = [
    { id: 1, nomeCantor: 'Marisa Monte', pais: 'Brasil' },
    { id: 2, nomeCantor: 'Coldplay', pais: 'Inglaterra' },
    { id: 3, nomeCantor: 'U2', pais: 'Irlanda' },
    { id: 4, nomeCantor: 'Djavan', pais: 'Brasil' },
    { id: 5, nomeCantor: 'Laura Pausini', pais: 'Italia' },
    { id: 6, nomeCantor: 'Roberto Leal', pais: 'Portugal' },
    { id: 7, nomeCantor: 'The Corrs', pais: 'Estados Unidos' },
    { id: 8, nomeCantor: 'Legiao Urbana', pais: 'Brasil' },
    { id: 9, nomeCantor: 'Cazuza', pais: 'Brasil' },
    { id: 10, nomeCantor: 'Tom Jobim', pais: 'Brasil' },
    { id: 11, nomeCantor: 'Frank Sinatra', pais: 'Estados Unidos' },
  ]
}
