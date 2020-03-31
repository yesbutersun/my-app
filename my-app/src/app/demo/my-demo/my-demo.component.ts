import {Component, OnInit} from '@angular/core';
import {ControlValueAccessor, NG_VALUE_ACCESSOR} from '@angular/forms';

@Component({
  selector: 'app-my-demo',
  templateUrl: './my-demo.component.html',
  styleUrls: ['./my-demo.component.css'],
  providers: [{
    provide: NG_VALUE_ACCESSOR,
    useExisting: MyDemoComponent,
    multi: true
  }]
})
export class MyDemoComponent implements OnInit, ControlValueAccessor {

  value = 0;
  onModelChange = (_: any) => {};

  constructor() {
  }

  ngOnInit() {
  }

  registerOnChange(fn: any): void {
    this.onModelChange = fn;
  }

  registerOnTouched(fn: any): void {
  }

  setDisabledState(isDisabled: boolean): void {
  }

  writeValue(obj: any): void {
    this.value = obj;
    console.log(this.value);
  }

  demoClick() {
    this.value++;
    this.onModelChange(this.value);
  }
}
