void main(){
  User userOne= User("Mario",23);
  User userTwo = User("Ligewra",22);
  print(userOne.age);
  print(userTwo.age);
  userOne.login();
  SuperUser userThree= SuperUser("123",423);
  userThree.publish();
  print(userThree.username);
  userThree.login();
}

class User{
  String username;
  int age;
  User(String u,int a){
    this.username=u;
    this.age=a;
  }
  void login(){
    print("User logged in");
  }
}

class SuperUser extends User{
  SuperUser(String username, int age) : super(username, age);

  void publish(){
    print("published update");
  }
}
