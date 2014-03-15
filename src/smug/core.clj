(ns smug.core)

(defmacro condescend [& forms]
  `(recur ~@forms))

(defmacro it-being-the-case-that [& forms]
  `(let ~@forms))

(defmacro sigh [& forms]
  `(prn ~@forms))

(defmacro actually [x msg]
  `(assert ~x (str "Actually, " '~x " " ~msg)))

(def ^:constant haskell false)
