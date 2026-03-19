class SalesReport implements IReport {
    public String generate() {
        return "Sales Report: [100$, 200$, 300$]";
    }
}

class UserReport implements IReport {
    public String generate() {
        return "User Report: [User1, User2, User3]";
    }
}
