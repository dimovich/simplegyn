;; prototype with basic styling and buttons
;;
;; add posts [DONE]
;; add about

;; Backend
;; - update roll [done]
;; - routing
;; - strip roll


;; Posts

;; markdown -or- hiccup -or- wysiwyg editor -or- selmer
;; https://github.com/yogthos/markdown-clj



;; tailwind

;; post editor
;; language
;;  cookie, check browser settings




;; dynamic posts
;;  cookies





;;  debug-grid-16-solid



;; db, dib, di, dn, dt / dtc / dt--fixed

;; w1,w2,w3,w4,w5, w-10..w-33..w-third..w-75..w100

;; mw1..mw9 / mw-100 / mw-none

;; h1..h5 / h-25..h-100

;; absolute / relative





;; markdown and tachyons customization
;; https://blakewilliams.me/posts/jekyll-markdown-and-tachyons




(require '[hiccup.page :as hp])

(hp/html5
 [:head
  [:title "SimpleGyn"]
  [:meta {:charset "UTF-8"}]
  [:meta {:name "viewport"
          :content "width=device-width, initial-scale=1"}]
  (hp/include-css "css/tachyons.min.css")]
 [:body
  ])
