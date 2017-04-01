package com.trupti_prajapati.retailapp.domain.mock;

import com.trupti_prajapati.retailapp.model.GlobaDataHolder;
import com.trupti_prajapati.retailapp.model.entities.Product;
import com.trupti_prajapati.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;


public class WebServer {

	private static WebServer fakeServer;

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
						"http://www.electronicsandyou.com/electronics-images/consumer%20electronics.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Furnitures",
						"Furnitures Items",
						"15%",
						"https://c69125.ssl.cf3.rackcdn.com/images/79172/2/bellano-solid-oak-extending-dining-table---160---200cm--and-4-monaco-chairs.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Lifestyle",
						"Lifestyle item",
						"10%",
						"http://static4.businessinsider.com/image/522e1b486bb3f7e0328e5eab-1200-924/young-women-girls-shopping-8.jpg"));
		GlobaDataHolder.getGlobaDataHolder().setListOfCategory(listOfCategory);
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
						"http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Bajaj 1701MT 17 L Solo Microwave Oven",
						"Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Whirlpool MW 25 BG 25 L Grill Microwave Oven",
						"http://img6a.flixcart.com/image/microwave-new/a/y/f/whirlpool-mw-25-bg-400x400-imaebagzstnngjqt.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Morphy Richards 25CG 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"IFB 25SC4 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/y/k/m/ifb-25sc4-400x400-imaef2pztynvqjaf.jpeg",
						""));

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
				"http://img5a.flixcart.com/image/television/g/y/w/vu-32k160mrevd-400x400-imae93ahpwtchzys.jpeg",
				""));

		tvList.add(new Product(
				"LED",
				"Vu 80cm (32) HD Ready LED TV",
				"Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
				"16000",
				"12",
				"13990",
				"0",
				"http://img6a.flixcart.com/image/television/z/f/w/bpl-bpl080d51h-400x400-imaeeztqvhxbnam2.jpeg",
				""));

		tvList.add(new Product(
				"LED",
				"Vu 80cm (32) HD Ready LED TV",
				"Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
				"16000",
				"12",
				"13990",
				"0",
				"http://img6a.flixcart.com/image/television/f/b/z/micromax-43x6300mhd-400x400-imaednxv8bgznhbx.jpeg",
				""));

		tvList.add(new Product(
				"LED",
				"Vu 80cm (32) HD Ready LED TV",
				"Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
				"16000",
				"12",
				"13990",
				"0",
				"http://img6a.flixcart.com/image/television/a/w/z/vu-32d6545-400x400-imaebagzbpzqhmxc.jpeg",
				""));

		tvList.add(new Product(
				"LED",
				"Vu 80cm (32) HD Ready LED TV",
				"Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
				"16000",
				"12",
				"13990",
				"0",
				"http://img6a.flixcart.com/image/television/s/r/t/lg-32lf550a-400x400-imae8nyvxyjds3qu.jpeg",
				""));

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
						"http://img5a.flixcart.com/image/vacuum-cleaner/e/e/g/eureka-forbes-easy-clean-easy-clean-plus-400x400-imae7dam5ey3vaeb.jpeg",
						""));

		productlist
				.add(new Product(
						"Easy Clean Plus Hand-held ",
						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
						"2699",
						"10",
						"2566",
						"0",
						"http://img6a.flixcart.com/image/vacuum-cleaner/j/e/x/nova-vc-761h-plus-vacuum-cleaner-400x400-imaecmhyadgxzzpg.jpeg",
						""));

		productlist
				.add(new Product(
						"Easy Clean Plus Hand-held ",
						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
						"2699",
						"10",
						"2566",
						"0",
						"http://img6a.flixcart.com/image/vacuum-cleaner/y/g/b/eureka-forbes-car-clean-car-clean-400x400-imae376v2kta5utj.jpeg",
						""));

		productlist
				.add(new Product(
						"Easy Clean Plus Hand-held ",
						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
						"2699",
						"10",
						"2566",
						"0",
						"http://img5a.flixcart.com/image/vacuum-cleaner/m/y/g/sarita-115-400x400-imae9b5zhzjagykx.jpeg",
						""));

		productlist
				.add(new Product(
						"Easy Clean Plus Hand-held ",
						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
						"2699",
						"10",
						"2566",
						"0",
						"http://img6a.flixcart.com/image/vacuum-cleaner/s/c/j/eureka-forbes-trendy-steel-trendy-steel-400x400-imae7vashkfj2hgk.jpeg",
						""));

		productMap.put("Vaccum Cleaner", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

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
						"http://img6a.flixcart.com/image/coffee-table/q/f/4/ct15bl-mdf-royal-oak-dark-400x400-imaeehkd8xuheh2u.jpeg",
						""));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
						""));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/u/n/p/brass-table0016-rosewood-sheesham-zameerwazeer-beige-400x400-imaedwk5ksph9ut2.jpeg",
						""));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img6a.flixcart.com/image/coffee-table/v/h/h/side-tb-53-ad-particle-board-debono-acacia-dark-matt-400x400-imaecnctfgjahsnu.jpeg",
						""));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
						""));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/k/y/h/1-particle-board-wood-an-wood-coffee-400x400-imae7uvzqsf4ynan.jpeg",
						""));

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
						""));

		productlist
				.add(new Product(
						"Bean Bag Chair Cover",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/e/f/p/flversaossblu-stainless-steel-nilkamal-400x400-imaeeptqczc5kbjg.jpeg",
						""));

		productlist
				.add(new Product(
						"Bean Bag Chair Cover",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/bean-bag/7/w/b/chr-01-fab-homez-xxxl-400x400-imae9qnbfwr9vkk4.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyhzefdzgz.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyytefgvz7.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/j/y/q/adpn-d021-pp-adiko-400x400-imaee2vrg9bkkxjg.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/bean-bag/t/8/n/fk0100391-star-xxxl-400x400-imae72dsb5h2r9uj.jpeg",
						""));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/bean-bag/3/h/w/rydclassicgreenl-rockyard-large-400x400-imae6zfaz6qzj3jd.jpeg",
						""));

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
						"http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
						""));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
						""));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
						""));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
						""));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
						""));

		productlist
				.add(new Product(
						"Metal Free Standing Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
						""));

		productMap.put("Almirah", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}


	//////////////////////////
	public void getAllLifestyle() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		// Men
		productlist
				.add(new Product(
						"  Timex®IQ watch",
						"Track activity and sleep without ruining your look. Stay in stylish sync with the Timex®IQ+ Move watch.",
						"Three-hand display",
						"800",
						"0",
						"650",
						"0",
						"http://a3.zassets.com/images/z/4/0/0/2/1/1/4002118-p-MULTIVIEW.jpg",
						""));

		productlist
				.add(new Product(
						" Bag",
						"Men's Spacedye Utility Backpack Blue - Merona™",
						"Blue color",
						"1020",
						"12",
						"700",
						"0",
						"https://tse2.mm.bing.net/th?id=OIP.ZvijZxxWFJnHyH8K4IZRNQEsEs&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
                        " purse",
                        "color Black",
                        "Keep your cash and cards safe with the Men's Slim Bifold Nylon Passcase Wallet - Swiss Gear. The slim style of the men's wallet features 10 credit card pockets, ID pocket, fold closure and a nylon fabric.",
                        "1020",
                        "12",
                        "700",
                        "0",
                        "http://target.scene7.com/is/image/Target/50363267?wid=520&hei=520&fmt=pjpeg",
                        ""));

        productlist
				.add(new Product(
						" ring",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"https://tse1.mm.bing.net/th?id=OIP.d1Q5WAqeeDBcB_5mwUWcKQEsEs&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
                        "Bracelet",
                        "color black",
                        "#unknown by ayesha#cuff #black #leather #mens #chunky #pewterstuds #silverbuckle.",
                        "598",
                        "35",
                        "388",
                        "0",
                        "https://rukminim1.flixcart.com/image/312/312/bangle-bracelet-armlet/z/y/d/unk-9048-free-ayesha-fashion-1-original-imaehfk3hyxqewhk.jpeg?q=70",
                        ""));
		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"https://tse3.mm.bing.net/th?id=OIP.xSj4phA0rYijYn3DKTNWmQEsEs&pid=15.1&P=0&w=300&h=300",
						""));

		productMap.put("Men", productlist);

		productlist = new ArrayList<Product>();

		// women
		productlist
				.add(new Product(
						"Top",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://tse4.mm.bing.net/th?id=OIP.Ofzx5ytPhhNJ1vlxyPALjQD0Es&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
						"ring",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://tse1.mm.bing.net/th?id=OIP.heoG3dmX40aBE2pX3MroMwEsEs&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
						"earing",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://tse1.mm.bing.net/th?id=OIP.50rUHPfh3bBi_6evuSRnPAEsEr&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
						"Watches",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/watch/b/g/a/8989pp02-sonata-original-imadxv8v3mrvqwxu.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"braslate",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/bangle-bracelet-armlet/f/h/u/b55421-free-young-forever-1-original-imaemvdufrcwz8g8.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"baleser",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/blazer/h/e/h/461b-subu-s-original-imaepz8ykhfhmrz6.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"kruti",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://tse1.mm.bing.net/th?id=OIP.jjhg_9pj0CIkYI5soUdsOACbEs&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
						"T-shirt",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						" to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/t-shirt/v/n/r/08180-vea-kupia-s-original-imaez7y593agjkp3.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						" jewellery",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"https://rukminim1.flixcart.com/image/832/832/jewellery-set/m/a/a/ag1680-atasi-international-original-imaepgb7thnazynk.jpeg?q=70",
						""));

		productMap.put("Women", productlist);

		productlist = new ArrayList<Product>();

		// kids
		productlist
				.add(new Product(
						"watch",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/watch/b/g/a/8989pp02-sonata-original-imadxv8v3mrvqwxu.jpeg?q=70\",",
		""));

		productlist
				.add(new Product(
						"girls top",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://tse4.mm.bing.net/th?id=OIP.Ofzx5ytPhhNJ1vlxyPALjQD0Es&pid=15.1&P=0&w=300&h=300",
						""));

		productlist
				.add(new Product(
						"watch",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/watch/z/j/e/sstw0011-chotabheam-zest4kids-original-imaehgccz8gmdw6v.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"Air chair",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/inflatable-product/u/q/r/jticitp-jainsoneretail-intex-teddy-bear-chair-air-pump-original-imaehh42kexgxkwr.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"Cap",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/cap/y/z/y/cool17-isweven-free-original-imaeedxehcesdhdd.jpeg?q=70",
						""));

		productlist
				.add(new Product(
						"Cycle" +
								"",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"https://rukminim1.flixcart.com/image/312/312/outdoor-toy/k/u/h/abhiyantt-wheel-power-swing-scooter-original-imaehfhwscsrvfpr.jpeg?q=70",
						""));

		productMap.put("Kids", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}





















	public static WebServer getFakeWebServer() {

		if (null == fakeServer) {
			fakeServer = new WebServer();
		}
		return fakeServer;
	}

	public void getAllProducts(int productCategory) {

		if (productCategory == 0) {

			getAllElectronics();
		} if(productCategory == 1) {

			getAllFurnitures();


		}
       if(productCategory == 2) {
            getAllLifestyle();
        }

	}

}
