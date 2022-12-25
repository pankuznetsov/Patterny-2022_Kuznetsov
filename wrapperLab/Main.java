package wrapperLab;

public class Main {
    public static void main(String[] args) {
        ListWrapper testWrapper = new ListWrapper();
        testWrapper.splitStringToList("mail.host.protocol");
        testWrapper.splitStringToList("mail.host.url");
        testWrapper.splitStringToList("mail.host.url.port");
        testWrapper.splitStringToList("mail.username");
        testWrapper.splitStringToList("not-mail");
        //Здесь я просто смотрю через дебаггер что все ок, писать вывод ручками не хочется
        int lol = 1;
    }
}
