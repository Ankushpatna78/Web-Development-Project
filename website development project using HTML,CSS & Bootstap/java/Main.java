class Staff {
    private int staffId;
    private String name;
    private String phone;
    private double salary;

    public Staff(int staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }
}

    class Teaching extends Staff {
        private String domain;
        private String publications;

        public Teaching(int staffId, String name, String phone, double salary, String domain, String publications) {
            super(staffId, name, phone, salary);
            this.domain = domain;
            this.publications = publications;
        }

        public String getDomain() {
            return domain;
        }

        public String getPublications() {
            return publications;
        }
    }

    class Technical extends Staff {
        private String skills;

        public Technical(int staffId, String name, String phone, double salary, String skills) {
            super(staffId, name, phone, salary);
            this.skills = skills;
        }

        public String getSkills() {
            return skills;
        }
    }

    class Contract extends Staff {
        private int period;

        public Contract(int staffId, String name, String phone, double salary, int period) {
            super(staffId, name, phone, salary);
            this.period = period;
        }

        public int getPeriod() {
            return period;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Staff[] staffList = new Staff[9];

            staffList[0] = new Teaching(101, "John Smith", "123-456-7890", 60000, "Computer Science", "Introduction to Java Programming");
            staffList[1] = new Teaching(102, "Jane Doe", "234-567-8901", 70000, "Mathematics", "Calculus II");
            staffList[2] = new Teaching(103, "Bob Johnson", "345-678-9012", 80000, "Physics", "Mechanics");

            staffList[3] = new Technical(201, "Mary Brown", "456-789-0123", 40000, "Database Management");
            staffList[4] = new Technical(202, "Tom Green", "567-890-1234", 50000, "Networking");
            staffList[5] = new Technical(203, "Karen Lee", "678-901-2345", 60000, "Web Development");

            staffList[6] = new Contract(301, "James Chen", "789-012-3456", 30000, 1);
            staffList[7] = new Contract(302, "Lisa Kim", "890-123-4567", 40000, 2);
            staffList[8] = new Contract(303, "Chris Lee", "901-234-5678", 50000, 3);

            for (Staff staff : staffList) {
                System.out.println("Staff ID: " + staff.getStaffId());
                System.out.println("Name: " + staff.getName());
                System.out.println("Phone: " + staff.getPhone());
                System.out.println("Salary: " + staff.getSalary());
                if (staff instanceof Teaching) {
                    Teaching teachingStaff = (Teaching) staff;
                    System.out.println("Domain: " + teachingStaff.getDomain());
                    System.out.println("Publications: " + teachingStaff.getPublications());
                }

                if (staff instanceof Technical) {
                    Technical technicalStaff = (Technical) staff;
                    System.out.println("Skills: " + technicalStaff.getSkills());
                }

                if (staff instanceof Contract) {
                    Contract contractStaff = (Contract) staff;
                    System.out.println("Contract Period: " + contractStaff.getPeriod());
                }

                System.out.println(); // for spacing
            }
        }
    }
