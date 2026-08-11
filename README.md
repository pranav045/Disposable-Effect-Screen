# PractiseDisposableEffect

A simple Jetpack Compose demo showcasing the use of **`DisposableEffect`** for lifecycle-aware side effects.  
This app demonstrates how to perform setup and cleanup actions when a composable enters and leaves the composition.

---

## ✨ Features
- Toggle button to show or remove a screen.
- Displays a toast message when the screen is shown.
- Displays a cleanup toast when the screen is removed.
- Demonstrates `DisposableEffect` usage in Compose.

---

## 📂 Project Structure
- **PractiseDisposableEffect.kt** → Main activity hosting the composable.
- **MainScreen()** → Contains toggle button and conditional rendering.
- **EffectScreen()** → Uses `DisposableEffect` to show lifecycle-aware toast messages.

---

## 🛠️ Tech Stack
- **Kotlin**
- **Jetpack Compose**
- **Material 3**

---

## 🚀 How It Works
1. Launch the app → You see a button and a welcome message.
2. Click **Remove Screen** → The composable is disposed, and a toast appears saying *"Screen Removed"*.
3. Click **Show Screen** → The composable is recreated, and a toast appears saying *"Showing Screen"*.

---

## 📸 Demo Flow
- **Initial State:** Screen visible → Toast: *Showing Screen*
- **On Remove:** Screen disposed → Toast: *Screen Removed*
- **On Show Again:** Screen recreated → Toast: *Showing Screen*

---

## 🎯 Purpose
This project is designed for beginners learning **Jetpack Compose side-effects**.  
It highlights how `DisposableEffect` can be used for resource management, cleanup, and lifecycle-aware tasks.

---

## 📖 License
This project is open-source and free to use for learning purposes.
