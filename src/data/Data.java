package data;

public class Data {

        private String login;
        private String password;
        private String confirmPassword;

        public static boolean checkData(String login, String password, String confirmPassword){
            try {
                if (checkLogin(login) == true && checkPassword(password,confirmPassword) == true) {
                    return true;
                }
            } catch (WrongPasswordException | WrongLoginException e){
                System.out.println("Произошла ошибка " + e);
            }
            return false;
        }

        public static boolean containsAllowedSymbols(String value) {
            return value.matches("\\w*");
        }

        public static boolean checkLogin(String login) throws WrongLoginException {
            if (login.length() > 20 || login.length() < 1 ||
                    login == null || !containsAllowedSymbols(login)) {
                throw new WrongLoginException("Некорректный логин!");
            }
            else{
                return true;
            }
        }
        public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
            if (password.length() > 20 || password.length() < 1 ||
                    password == null ||
                    !containsAllowedSymbols(password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Некорректный пароль!");
            }
            else{
                return true;
            }
        }
}
