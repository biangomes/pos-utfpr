import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ButtonModule } from 'primeng/button';
import { SidebarModule } from 'primeng/sidebar';
import { NavbarComponent } from './navbar.component';

describe('NavbarComponent', () => {
  let component: NavbarComponent;
  let fixture: ComponentFixture<NavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [NavbarComponent],
      imports: [ButtonModule, SidebarModule]
    }).compileComponents();

    fixture = TestBed.createComponent(NavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should open and close the menu when the bars button is clicked', () => {
    const button: HTMLButtonElement = fixture.nativeElement.querySelector('button');

    expect(component.menuVisivel).toBeFalse();
    button.click();
    expect(component.menuVisivel).toBeTrue();
    button.click();
    expect(component.menuVisivel).toBeFalse();
  });
});
