
//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.


//아래 자료형 배열 --> 데이터 여러개 존재 --> 순번으로 접근 (반복 돌리기)
//주의사항 (접근할때 참고하기): item_list[0]  --> 자료형'객체임'   -->  item_list[0] = { ...... }  
// item_list[0].item_name   --> 자료형 '문자열'  
// item_list[0].size[1]  ---> 자료형 '정수'
const item_list = [
  {
    item_name : '여름 셔츠',
    price : 25000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
item_list.forEach(function(e,i){
  if(e.brand == 'java마켓'){
    console.log(`상품명 : ${e.item_name} \n가격: ${e.price}`)
  }
})


//2. 95사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
  item_list.forEach(function(e,i){
    for(const a of e.size){
      if(a == 95){
        console.log(`95사이즈 : ${e.item_name}` )
      }
    }
  })


//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.

//풀이

function addItem(){

  //체크박스들 
  if(document.querySelector('#itemName').value == ''){
    alert('상품명을 입력하세요')
  }else{
  let chk = null;
  const checks = document.querySelectorAll('.size:checked');
   // size도 배열!!!!!!!!!!!!!!!
  const size =[]; 
  checks.forEach((check, i)=>{
      // size도 배열!!!!!!!!!!!!!!!
        size.push(check)}
  )
  //추가할 객체 
  const add_data = {
    item_name : document.querySelector('#itemName').value,
    price : document.querySelector('#price').value,
    brand : document.querySelector('#brand').value,
    size : size
  }
  item_list.push(add_data);
  console.log(item_list)
}
}


//   const cheks = document.querySelectorAll('.size')
//   const itemName = document.querySelector('#itemName').value
//   const price = document.querySelector('#price').value
//   const brand = document.querySelector('#brand').value


// function addItem(){
//    if(itemName ==""){
//     alert('상품명을 입력하세요')
//    }else{
//       item_list.push(
//       {
//         item_name : itemName,
//         price : price,
//         brand : brand,
//         size : ''
//       }
//     )
//   }
// }
