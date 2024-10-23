
//친구 정보
public class Friend {
    private String name;
    private Company company;

    public Friend(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }


    //친구가 다니는 회사의 주소 정보를 출력하는 메소드
    public void printCompanyAddress(){
        String addr = null;

        Company comp = getCompany();
        if(comp != null){
           ContactInfo contactInfo = comp.getContactInfo();
            if(contactInfo != null){
                addr = contactInfo.getAddr();
            }
        }

        if(addr != null){
            System.out.println(addr);
        }else {
            System.out.println("주소정보가 없습니다.");
        }

    }

}
