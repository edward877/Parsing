import Service.WorkParsService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
//        WorkParsService workParsService = new WorkParsService();
//        workParsService.work(0);
//        String header = " id   | name\t| category\t|  otherCategory\t|.... text\n";
//        System.out.println(header + workParsService.getElements());

        String input = "«Печатное издание русскую патриотическую газету в черно-белом исполнении под названием «Рубеж» № 3 (191)" +
                " октябрь 2009 года, на четырех листах, на первом листе статья под названием «Белые и красные», " +
                "автор И.В.Артемов (отпечатано 03.10.2009 ООО «Сфера» г. Москва, ул. Авиамоторная, д. 12, тиражом 2000 экземпляров)» (решение Ленинского районного суда города Владимира от 09.06.2010).».";
        Pattern pattern1 = Pattern.compile("автор -(.+),|\\(|\\|");
        Pattern pattern2 = Pattern.compile("авторы -(.+),(.+),");
        Pattern pattern3 = Pattern.compile("автор (.+),");
        Matcher matcher = null;

        /////
        if(input.contains("автор - ")) {
            matcher = pattern1.matcher(input);
            matcher.find();
            System.out.println(matcher.group(1));
        } else if (input.contains("авторы - ")){
            matcher = pattern2.matcher(input);
            matcher.find();
            System.out.println(matcher.group(1) + " " + matcher.group(2));
        } else if (input.contains("автор")) {

        }
    }

}
