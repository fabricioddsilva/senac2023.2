const staticCachename = 'site-static';
const assets = [
  '/',
  '/index.html',
  '/assets/js/app.js',
  '/assets/js/ui.js',
  '/assets/css/style.css',
  '/assets/vendor/aos/aos.css',
  '/assets/vendor/aos/aos.js',
  '/assets/vendor/bootstrap/css/bootstrap.min.css',
  '/assets/vendor/bootstrap-icons/bootstrap-icons.css',
  '/assets/vendor/boxicons/css/boxicons.min.css',
  '/assets/vendor/glightbox/css/glightbox.min.css',
  '/assets/vendor/swiper/swiper-bundle.min.css',
  '/assets/vendor/purecounter/purecounter_vanilla.js',
  '/assets/vendor/bootstrap/js/bootstrap.bundle.min.js',
  '/assets/vendor/glightbox/js/glightbox.min.js',
  '/assets/vendor/isotope-layout/isotope.pkgd.min.js',
  '/assets/vendor/swiper/swiper-bundle.min.js',
  '/assets/vendor/php-email-form/validate.js',
  '/assets/img/icon/kaos.png',
  '/assets/img/icon/kaos48.png',
  '/assets/img/testimonials/Duda 400.png',
  '/assets/img/testimonials/Fabrício 400.png',
  '/assets/img/testimonials/Laura 400.png',
  '/assets/img/testimonials/Luis 400.png',
  '/assets/img/about.jpg',
  '/assets/img/counts-bg.png',
  '/assets/img/features.svg',
  '/assets/img/footer-bg.jpg',
  '/assets/img/hero-bg.jpg',
  'https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i'
  

];

//install service worker
self.addEventListener('install', evt=>{
  //console.log('service worker foi instalado')
  evt.waitUntil(
  caches.open(staticCachename).then(cache => {
    console.log('catching shell assets')
    cache.addAll(assets)
  })
  );
});

//activate service worker
self.addEventListener('activate', evt =>{
  //console.log('service worker está ativado')
});

//fetch events
self.addEventListener('fetch', evt => {
  //console.log('fetch event', evt)
  evt.respondWith(
    caches.match(evt.request).then(cacheRes => {
      return cacheRes || fetch(evt.request);
    })
  )
});

