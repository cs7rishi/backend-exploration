package pattern;

public class User {

  private final String name;
  private final String phoneNumber;
  private final String email;
  private final String address;
  private final String profilePicUrl;

  private User(UserBuilder builder) {
    this.name = builder.name;
    this.phoneNumber = builder.phoneNumber;
    this.email = builder.email;
    this.address = builder.address;
    this.profilePicUrl = builder.profilePicUrl;
  }

  public static class UserBuilder {

    private final String name;
    private final String phoneNumber;
    private String email;
    private String address;
    private String profilePicUrl;

    public UserBuilder(String name, String phoneNumber) {
      this.name = name;
      this.phoneNumber = phoneNumber;
    }

    public UserBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public UserBuilder setAddress(String address) {
      this.address = address;
      return this;
    }

    public UserBuilder setProfilePicUrl(String url) {
      this.profilePicUrl = url;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        ", profilePicUrl='" + profilePicUrl + '\'' +
        '}';
  }
}
