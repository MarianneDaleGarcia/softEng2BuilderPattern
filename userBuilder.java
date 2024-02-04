public static class userBuilder {
        private final String firstName;
        private final String lastName;
        private final String email;
        private String address;
        private String phone;
        private int age;

        public userBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public userBuilder address(String address) {
            this.address = address;
            return this;
        }

        public userBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public userBuilder age(int age) {
            this.age = age;
            return this;
        }

        public user build() {
            return new user(this);
        }
    }
}