/*
Final Project 2021
 */

package com.pfinal.onlineshop_project.domain.mock;

import com.pfinal.onlineshop_project.model.CenterRepository;
import com.pfinal.onlineshop_project.model.entities.Product;
import com.pfinal.onlineshop_project.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Electronic",
                        "Electric Items",
                        "10%",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeNSONF3fr9bZ6g0ztTAIPXPRCYN9vtKp1dXQB2UnBm8n5L34r"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Furnitures",
                        "Furnitures Items",
                        "15%",
                        "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRaUR5_wzLgBOuNtkWjOxhgaYaPBm821Hb_71xTyQ-OdUd-ojMMvw"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Ovens
        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "IFB 17PMMEC1 17 L Solo Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5490",
                        "10",
                        "4290",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/77/797035/1.jpg?6216",
                        "oven_1"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Bajaj 1701MT 17 L Solo Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5000",
                        "10",
                        "4290",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/04/448904/1.jpg?8219",
                        "oven_2"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Whirlpool MW 25 BG 25 L Grill Microwave Oven",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/34/188361/1.jpg?2009",
                        "5290",
                        "10",
                        "4290",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/34/188361/1.jpg?2009",
                        "oven_3"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Morphy Richards 25CG 25 L Convection Microwave Oven",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/97/543871/1.jpg?8900",
                        "5300",
                        "12",
                        "4290",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/97/543871/1.jpg?8900",
                        "oven_4"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "IFB 25SC4 25 L Convection Microwave Oven",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/81/551082/1.jpg?2625",
                        "5190",
                        "10",
                        "4290",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/81/551082/1.jpg?2625",
                        "oven_5"));

        productMap.put("Microwave oven", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(
                "LED",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/38/935023/1.jpg?0431",
                "tv_1"));

        tvList.add(new Product(
                "LED 1",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "17000",
                "12",
                "13990",
                "0",
                "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/71/811084/1.jpg?2290",
                "tv_2"));

        tvList.add(new Product(
                "LED 2",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "18000",
                "12",
                "13990",
                "0",
                "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/35/949634/1.jpg?1427",
                "tv_3"));

        tvList.add(new Product(
                "LED 3",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/36/753572/1.jpg?7444",
                "tv_4"));

        tvList.add(new Product(
                "LED 4",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/68/667102/1.jpg?7823",
                "tv_5"));

        productMap.put("Television", tvList);

        productlist = new ArrayList<Product>();

        // Vaccum Cleaner
        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/13/374135/1.jpg?1293",
                        "v_cleaner_1"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/71/766084/1.jpg?8887",
                        "v_cleaner_2"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/25/121145/1.jpg?1353",
                        "v_cleaner_3"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/17/221145/1.jpg?1420",
                        "v_cleaner_4"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/26/907505/1.jpg?5691",
                        "v_cleaner_5"));

        productMap.put("Vaccum Cleaner", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Table
        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/12/621435/1.jpg?9352",
                        "table_1"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/76/480994/1.jpg?2315",
                        "table_2"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/53/621435/1.jpg?9347",
                        "table_3"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/93/869984/1.jpg?7234",
                        "table_4"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/25/431735/1.jpg?7713",
                        "table_5"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/96/403094/1.jpg?2653",
                        "table_6"));

        productMap.put("Tables", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "http://img5a.flixcart.com/image/bean-bag/5/b/b/boss-moda-chair-br1088-comf-on-xxxl-400x400-imae9k78vg8gjh3q.jpeg",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/11/093525/1.jpg?6878",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/21/287635/1.jpg?2033",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/43/587635/1.jpg?2161",
                        "chair_4"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/61/233525/1.jpg?4777",
                        "chair_5"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/23/803525/1.jpg?0622",
                        "chair_6"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/25/003454/1.jpg?8331",
                        "chair_7"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.jumia.co.ke/generic-soft-back-cushion-rocking-chair-lounger-bench-pad-for-ho-red-50525863.html",
                        "chair_8"));

        productlist
                .add(new Product(
                        "Adiko Leatherette Office Chair",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/28/9959/1.jpg?6634",
                        "chair_9"));

        productMap.put("Chairs", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/60/881844/1.jpg?3074",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/84/954335/1.jpg?7046",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/42/960425/1.jpg?1510",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/95/659074/1.jpg?3666",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/39/226923/1.jpg?6577",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Metal Free Standing Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://ke.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/73/623402/1.jpg?3134",
                        "almirah_6"));

        productMap.put("Almirah", productlist);

        productMap.put("Almirah", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
