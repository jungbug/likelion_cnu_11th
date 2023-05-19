package org.likelion.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();
    @AfterEach
	void afterEach(){
		itemRepository.clearStore();
	}


    @Test
    void save(){
        Item item = new Item("itemA", 10000, 10);

        Item savedItem = itemRepository.save(item);

        Item findItem = itemRepository.findById(item.getId());

        assertThat(findItem).isEqualTo(savedItem);
    }

    @Test
    void findAll(){
        Item item1 = new Item("itemA", 10000, 10);
        Item item2 = new Item("itemB", 20000, 20);

        itemRepository.save(item1);
        itemRepository.save(item2);

        List<Item> result = itemRepository.findAll();

        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(item1, item2);
    }

    @Test
    void updateItem(){
        Item item = new Item("itemA", 10000, 10);
        Item item2 = new Item("itemC", 1000,30);
        Item savedItem = itemRepository.save(item);
        System.out.println(item); // item
        Long itemId = savedItem.getId(); // 3

        Item updateParam = new Item("itemB", 20000, 20);
        itemRepository.update(itemId, updateParam);
        Item findItem = itemRepository.findById(itemId);
        assertThat(findItem.getItemName()).isEqualTo(item.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(item.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(item.getQuantity());

    }




}
