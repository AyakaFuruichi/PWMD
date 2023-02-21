const tl = gsap.timeline();

tl.from(".logo", {
    duration: 1,
    x: -10,
    opacity: 0,
    stagger: 0.02
},"first");

tl.from(".nav li", {
    duration: 1,
    x: -10,
    opacity: 0,
    ease: "power4.out",
    stagger: 0.03
},"first");

tl.from(".title", {
    duration: 1,
    y: 10,
    opacity: 0
}, 0.5);

tl.from(".tagline", {
    duration: 1,
    y: 10,
    opacity: 0
}, "<0.5");

tl.from(".desc", {
    duration: 1,
    y: 10,
    opacity: 0
}, "<");

tl.from(".beer", {
    duration: 1,
    y: -1000,
    opacity: 0,
    ease: "Power1.inOut"
}, "<+0.5");

tl.fromTo(".beer", 
    { y: -150 },
    { y: -120,
        duration: 2,
        ease: "power1.inOut", // 進行具合
        repeat: -1, // 無限に繰り返し
        yoyo: true 
    }, 0.15);