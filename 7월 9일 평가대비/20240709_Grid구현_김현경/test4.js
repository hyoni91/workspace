

function checkAllMenu() {

  // isChecked -> checked (true)상태
  const isChecked = document.querySelector('#chk_all').checked;

  //모든 input태그들
  const menus = document.querySelectorAll('input');

  if (isChecked) {
    for (const menu of menus) {
      menu.checked = true;
    }
  } 
  else {
    for (const menu of menus) {
      menu.checked = false;
    }

  }
}






//menuInput이란 this 속성의 이름 (지금 현재 태그)
function checkAllOption(menuInput) {

  //this태그 cheked 의 경우 IsChecked = true상태
  const isChecked = menuInput.checked;


 //체크박스들 
 //this태그의. 다음 형제 (ul)안의. 쿼리들 (input태그)
 const chks = menuInput.nextElementSibling.querySelectorAll('input');
 

  if(isChecked){
    for(const chk of chks){
      chk.checked = true;
    }
  }
  else{
    for(const chk of chks){
      chk.checked = false;
    }
  }
}


// function checkAllOption(menuInput) {
//   //선택 태그 체크 하면, 또는 안하면
//   const lis = menuInput.closest('input').checked
//   const isList = lis
//   //ul
//   const test = document.querySelector('.menu')
//   //list
//   const test2 = test.nextElementSibling

//   //li
//   const test3 = test2.children
//   for (const chid of test3) {
//     console.log(chid)
//   }



//   if (isList) {
//     for (const list of test3) {
//       list.firstChild.checked = true;
//     }
//   } else {
//     for (const list of test3) {
//       list.firstChild.checked = false;
//     }
//   }

// }