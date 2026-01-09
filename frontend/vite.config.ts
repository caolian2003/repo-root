import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    // 앞으로 사용할 port 지정
    port:3000,
    //  back에서 받을 포트 지정
    proxy: {
      '/api':{
        target: 'http://localhost:8080',
        changeOrigin: true
      }
    }
  }
})
