package hello.itemservice;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 확인용 초기 데이터 추가
     */
    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        log.info("test data init");
        itemRepository.save(new Item("itemA", 10000, 10));
        itemRepository.save(new Item("itemB", 20000, 20));
        itemRepository.save(new Item("itemC", 20000, 20));
        itemRepository.save(new Item("itemD", 20000, 20));
        itemRepository.save(new Item("itemF", 10000, 10));
        itemRepository.save(new Item("itemG", 20000, 20));
        itemRepository.save(new Item("itemH", 20000, 20));
        itemRepository.save(new Item("itemI", 20000, 20));
    }

}
