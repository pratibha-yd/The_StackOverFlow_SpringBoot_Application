package pratibha.knoldus.springbootclone.controller.web;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pratibha.knoldus.springbootclone.domain.Tag;
import pratibha.knoldus.springbootclone.service.TagService;

import java.util.Optional;

import static pratibha.knoldus.springbootclone.controller.ControllerConstants.TAGS_PATH;

@Controller
@RequestMapping(TAGS_PATH)
@AllArgsConstructor
public class TagController {

    private static final String TEMPLATE_DIR = "tag";
    private static final String LIST_TEMPLATE = TEMPLATE_DIR + "/list";

    private final TagService tagService;

    @ModelAttribute("module")
    public String module() {
        return "tags";
    }

    @GetMapping
    public String findAll(Model model, @PageableDefault(
            sort = { "name" }, direction = Sort.Direction.DESC, size = 40) Pageable pageable) {
        Page<Tag> tags;
        Optional<String> sort = pageable
            .getSort()
            .get()
            .map(Sort.Order::getProperty).findFirst();

        sort.ifPresent(s -> {
            if (s.equals("popular")) {
                model.addAttribute("tags", tagService
                        .findAllByMostPopular(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize())));
            } else {
                model.addAttribute("tags", tagService.findAll(pageable));
            }
        });

        return LIST_TEMPLATE;
    }


}
