package Quiz;

public class CustomerFinal {

    private String name;
    private boolean member = false;
    private String memberType;

    public CustomerFinal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public  void setMember(boolean member){
        this.member= member;
    }
    public boolean isMember() {
        return member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberType() {
        return memberType;
    }



    @Override
    public String toString() {
        return "Customer(" +
                "name=" + name +
                ", member=" + member +
                ", memberType=" + memberType +
                ')';
    }
}