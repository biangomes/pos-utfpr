import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CantorCardComponent } from './cantor-card.component';

describe('CantorCardComponent', () => {
  let component: CantorCardComponent;
  let fixture: ComponentFixture<CantorCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CantorCardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CantorCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
