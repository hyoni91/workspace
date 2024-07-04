let sum = 0;
const ageAll = document.querySelectorAll('.ageTd')
 for(let age of ageAll){
  sum = Number(sum)+Number(age.textContent);

  } console.log(sum/3.0)




function setAvgAge(){
  //구할 나이의 태그선택
  let sum = 0;
const ageAll = document.querySelectorAll('.ageTd')
 for(let age of ageAll){
  sum = Number(sum)+Number(age.textContent);

  }const result = sum/3.0
   //나이의 합과 평균 구하기
  
   // 결과값 출력할 노드 선택
  document.querySelector('#resultTd').textContent = result


 }

 
 
  

