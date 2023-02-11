// $(".openbtn1").click(function () {
//   //ボタンがクリックされたら
//   $(this).toggleClass("active"); //ボタン自身に activeクラスを付与し
//   $("#g-cart").toggleClass("panelactive"); //ナビゲーションにpanelactiveクラスを付与
// });

// $("#g-nav a").click(function () {
//   //ナビゲーションのリンクがクリックされたら
//   $(".openbtn1").removeClass("active"); //ボタンの activeクラスを除去し
//   $("#g-cart").removeClass("panelactive"); //ナビゲーションのpanelactiveクラスも除去
// });

$(".slider").slick({
  autoplay: true, //自動的に動き出すか。初期値はfalse。
  infinite: true, //スライドをループさせるかどうか。初期値はtrue。
  speed: 500, //スライドのスピード。初期値は300。
  slidesToShow: 3, //スライドを画面に3枚見せる
  slidesToScroll: 1, //1回のスクロールで1枚の写真を移動して見せる
  prevArrow: '<div class="slick-prev"></div>', //矢印部分PreviewのHTMLを変更
  nextArrow: '<div class="slick-next"></div>', //矢印部分NextのHTMLを変更
  centerMode: true, //要素を中央ぞろえにする
  variableWidth: true, //幅の違う画像の高さを揃えて表示
  dots: true, //下部ドットナビゲーションの表示
});

//初回のみモーダルをすぐ出す判定。flagがモーダル表示のstart_open後に代入される
var access = $.cookie("access");
if (!access) {
  flag = true;
  $.cookie("access", false);
} else {
  flag = false;
}

//モーダル表示
$(".modal-open").modaal({
  start_open: flag, // ページロード時に表示するか
  overlay_close: true, //モーダル背景クリック時に閉じるか
  before_open: function () {
    // モーダルが開く前に行う動作
    $("html").css("overflow-y", "hidden"); /*縦スクロールバーを出さない*/
  },
  after_close: function () {
    // モーダルが閉じた後に行う動作
    $("html").css("overflow-y", "scroll"); /*縦スクロールバーを出す*/
  },
});

window.addEventListener("DOMContentLoaded", function () {
  //name 属性が categories の input 要素（ラジオボタン）の集まり（静的な NodeList）を取得
  const input_categories = document.querySelectorAll("input[name=categories]");
  //全ての .target の要素（target クラスを指定された div 要素）を取得
  const targets = document.querySelectorAll(".target");

  //ループで各ラジオボタンにイベントリスナを設定
  for (let input_category of input_categories) {
    //change イベントリスナを各ラジオボタンに登録
    input_category.addEventListener("change", function () {
      for (let target of targets) {
        //全ての .target の要素に display: block; を設定
        target.style.setProperty("display", "block");
      }
      //ラジオボタンが選択された場合
      if (this.checked) {
        //ラジオボタンの value 属性が All 以外の場合
        if (this.value !== "All") {
          //target クラスの要素で data-category 属性にこのラジオボタンの value 属性の値が含まれていないものを全て取得
          const not_checked_categories = document.querySelectorAll(
            ".target:not([data-category~=" + '"' + this.value + '"])'
          );
          //取得した要素に display: none を設定して非表示に
          for (let not_checked_category of not_checked_categories) {
            not_checked_category.style.setProperty("display", "none");
          }
        }
      }
    });
  }
});

let shop = document.getElementById("shop");



let basket = JSON.parse(localStorage.getItem("data")) || [];
// let basket = [];

let generateShop = () => {

    return (shop.innerHTML = shopItemsData
        .map((x)=>{
            let {id, name, price, desc, img, category} = x;
            let search = basket.find((x) => x.id === id) || [];
            return `
            <div id=product-id-${id} class="target" data-category=${category}>
                <a href="#detail_01" class="modal-open">
                    <img width="220" src="${img}" alt="">
                </a>
                <div class="details">
                    <a href="#detail_01" class="modal-open"><h3>${name}</h3></a>
                    <p>${desc}</p>
                    <div class="price-quantity">
                        <h2>$ ${price}</h2>
                        <div class="buttons">
                            <i onclick="decrement(${id})" class="bi bi-dash-lg"></i>
                            <div id=${id} class="quantity">${search.item === undefined? 0: search.item}</div>
                            <i onclick="increment(${id})" class="bi bi-plus-lg"></i>
                        </div>
                        <i onclick="calculation()" id="addBtn"class="bi bi-bag-check"></i>
                    </div>
                </div>
            </div>
            `;
        })
        .join(""));

        
};

generateShop();


let increment = (id) => {
    let selectedItem = id;
    let search = basket.find((x)=> x.id === selectedItem.id);
    if(search === undefined){
        basket.push(
            {
                id: selectedItem.id,
                item:1
            }
        );
    }else{
        search.item += 1;
    }

    localStorage.setItem("data", JSON.stringify(basket));
    update(selectedItem.id);
    
};

let decrement = (id) => {
    let selectedItem = id;
    let search = basket.find((x)=> x.id === selectedItem.id);

    if(search === undefined){
      return;
    }else if(search.item === 0){
        return;
    }else{
        search.item -= 1;
    }

    update(selectedItem.id);
    basket = basket.filter((x)=>x.item !== 0);

    localStorage.setItem("data", JSON.stringify(basket));
};

let update = (id) => {
    let search = basket.find((x) => x.id === id);
    document.getElementById(id).innerHTML = search.item;
    calculation();
};

let calculation = () => {
    let cartIcon = document.getElementById("cartAmount");
    cartIcon.innerHTML = basket.map((x) => x.item).reduce((x, y) => x + y, 0);
}

// $(".HomeBtn").click(function () {
//   //ナビゲーションのリンクがクリックされたら
//   $("#g-cart").removeClass("panelactive"); //ナビゲーションのpanelactiveクラスも除去
// });
