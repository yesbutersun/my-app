import {Component} from '@angular/core';
import {FormBuilder, FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  searchForm: FormGroup;
  value = 0;

  // test = new FormControl(1);

  constructor(private fb: FormBuilder) {
    this.searchForm = this.fb.group({
        test: [null]
      }
    );
  }

  myClick() {
    this.value++;
    console.log(this.searchForm.value);
    this.searchForm.controls.test.patchValue(this.value);
    // this.searchForm.value.test = this.value;
  }
}
