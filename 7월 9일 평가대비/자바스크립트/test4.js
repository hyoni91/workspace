



function checkAllMenu() {
  const isChecked = document.querySelector('#chk_all').checked;
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



function checkAllOption(menuInput) {
  const isChecked = menuInput.checked;


 //체크박스들 
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