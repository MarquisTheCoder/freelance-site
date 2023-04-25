/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["../resources/templates/**/*.{html,js}"], // it will be explained later
  theme: {
    extend: {
      fontFamily: {
        syne: ["Syne", "sans-serif"],
        arimo: ["Arimo", "helvetica"],
      },
      backgroundColor: {
        primary: ["##F8F8F8"],
      },
    },
  },
  plugins: [],
};
