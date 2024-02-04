public class user {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;

	User user = new user.userBuilder("Juan", "Dela Cruz", "jdcjdc42@gmail.com")
                .address("123 Main St")
                .phone("09987654321")
                .age(42)
                .build();

	System.out.println(user.getFirstName());
	System.out.println(user.getLastName());
	System.out.println(user.getEmail());
	System.out.println(user.getAddress());
	System.out.println(user.getPhone());
	System.out.println(user.getAge());

    private user(userBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }