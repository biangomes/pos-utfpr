import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';
import { TableModule } from 'primeng/table';
import { TooltipModule } from 'primeng/tooltip';

import { DepartamentosPesquisaComponent } from './departamentos-pesquisa.component';

describe('DepartamentosPesquisaComponent', () => {
  let component: DepartamentosPesquisaComponent;
  let fixture: ComponentFixture<DepartamentosPesquisaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DepartamentosPesquisaComponent ],
      imports: [ButtonModule, InputTextModule, TableModule, TooltipModule]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DepartamentosPesquisaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should provide 11 departments with an id and name', () => {
    expect(component.departamentos.length).toBe(11);
    expect(component.departamentos.every(departamento =>
      typeof departamento.id === 'number' &&
      typeof departamento.nomeDepartamento === 'string'
    )).toBeTrue();
  });
});
