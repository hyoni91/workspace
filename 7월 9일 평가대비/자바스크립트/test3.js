


function addTable(){
  // 행, 열의 넘버 받기
  const num1 = document.querySelector('#rowInput').value

  console.log(num1)

  const num2 = document.querySelector('#colInput').value

  console.log(num2)

  // 추가할 테이블의 정보? 문자열
  let str ='<table>';
  
  for(let i =0; i < num1; i++){
    str += `<tr>`
    for(let j = 0; j < num2 ; j++){
      str +=`<td></td>`
    }
    str += "</tr>"
  }

  str += "</table>";
  
  //위치선청
  const table = document.querySelector('.table-div')

  const span = document.querySelector('.table-div > span')

  //추가 ㄱㄱ
  span.remove()
  table.insertAdjacentHTML('beforeend',str);

}

