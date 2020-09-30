package com.avelircraft;

import com.avelircraft.models.News;
import com.avelircraft.repositories.CustomizedNewsCrudRepository;
import com.avelircraft.services.NewsDataService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { SpringBootApplicationClass.class })
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpringBootApplicationClassTests {

    @Autowired
    private NewsDataService newsDataService;

    @Test
    public void testNewsDataService() {
        System.out.println("Start 1");
        News news = new News();
        newsDataService.save(news);
        News news2 = new News("header", "message");
        newsDataService.save(news2);

        System.out.println("-------------------------------------------");
        System.out.println("Start 2");
        Iterable<News> newsI = newsDataService.findAll();
        if(!newsI.iterator().hasNext()) {
            System.out.println("No news found");
        }
        else {
            //news.forEach(System.out::println);
            Iterator<News> it = newsI.iterator();
            while (it.hasNext()) {
                News item = it.next();
                System.out.println(item);
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("Start 3");
        newsDataService.deleteAll();

        System.out.println("-------------------------------------------");
        System.out.println("Start 4");
        newsI = newsDataService.findAll();
        if(!newsI.iterator().hasNext()) {
            System.out.println("No news found");
        }
        else {
            //news.forEach(System.out::println);
            Iterator<News> it = newsI.iterator();
            while (it.hasNext()) {
                News item = it.next();
                System.out.println(item);
            }
        }
    }

//    @Test
//    @Transactional
//    @Commit
//    public void test1AddNewsCrudRepository() {
//        System.out.println("Start 1");
//        News news = new News();
//        newsDataService.save(news);
//        News news2 = new News("header", "message");
//        newsDataService.save(news2);
//    }

//    @Test
//    @Transactional
//    public void test2FindAllNews() {
//        System.out.println("Start 2");
//        Iterable<News> news = newsDataService.findAll();
//
//        if(news == null || !news.iterator().hasNext()) {
//            System.out.println("No news found");
//        }
//        else {
//            //news.forEach(System.out::println);
//            Iterator<News> it = news.iterator();
//            while (it.hasNext()) {
//                News item = it.next();
//                System.out.println(item);
//            }
//        }
//    }

//    @Test
//    @Transactional
//    @Commit
//    public void test3DeleteNews() {
//        System.out.println("Start 3");
//        newsDataService.deleteAll();
//    }
}
