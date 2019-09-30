import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaidSignupComponent } from './paid-signup.component';

describe('PaidSignupComponent', () => {
  let component: PaidSignupComponent;
  let fixture: ComponentFixture<PaidSignupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaidSignupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaidSignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
