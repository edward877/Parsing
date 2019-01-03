package Service;

import Dto.ElementDocument;
import Enums.Category;
import Enums.OtherCategory;
import Util.Pars;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WorkParsService {

    List<ElementDocument> elements;

    public WorkParsService() {
        elements = new ArrayList<>();
    }

    public void work(int maxNumberLine) {
        String path = "C:\\Users\\Эдвард\\Documents\\материалы.txt";
        File file = new File(path);
        Pars pars;
        for (String line : FileService.getFileTextLine(file, maxNumberLine)) {
            pars = new Pars(line);
            if (pars.isTrash()) {
                continue;
            }
            ElementDocument elementDocument = new ElementDocument(line);
            elementDocument.setId(Integer.parseInt(pars.parseId().trim()));
            Category category = Category.getCategoryByText(line);
            elementDocument.setCategory(category);
            if (category == Category.OTHER) {
                OtherCategory otherCategory = OtherCategory.getOtherCategoryByText(line);
                elementDocument.setOtherCategory(otherCategory);
            }

            elements.add(elementDocument);
        }
    }

    public List<ElementDocument> getElements() {

//        return elements.stream().filter(elementDocument -> elementDocument.getOtherCategory()!=null).collect(Collectors.toList());
        return elements.stream().collect(Collectors.toList());
    }
}
