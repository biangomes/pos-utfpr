import { Component } from '@angular/core';

@Component({
  selector: 'app-departamentos-pesquisa',
  templateUrl: './departamentos-pesquisa.component.html',
  styleUrls: ['./departamentos-pesquisa.component.css']
})
export class DepartamentosPesquisaComponent {
  departamentos = [
    { id: 1, nomeDepartamento: 'Recursos Humanos' },
    { id: 2, nomeDepartamento: 'Financeiro' },
    { id: 3, nomeDepartamento: 'Tecnologia da Informação' },
    { id: 4, nomeDepartamento: 'Marketing' },
    { id: 5, nomeDepartamento: 'Vendas' },
    { id: 6, nomeDepartamento: 'Operações' },
    { id: 7, nomeDepartamento: 'Jurídico' },
    { id: 8, nomeDepartamento: 'Logística' },
    { id: 9, nomeDepartamento: 'Atendimento ao Cliente' },
    { id: 10, nomeDepartamento: 'Compras' },
    { id: 11, nomeDepartamento: 'Pesquisa e Desenvolvimento' }
  ];
}
