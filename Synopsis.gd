extends Node2D

# Entry point
func _ready():
    print("Hello, Godot!")
    greet("Player")

# Variables and Types
var score: int = 0
var player_name: String = "Hero"
var is_alive: bool = true
var position: Vector2 = Vector2(100, 200)

# Constants
const MAX_HEALTH := 100

# Functions
func greet(name: String) -> void:
    print("Welcome, %s!" % name)

func add(a: int, b: int) -> int:
    return a + b

# If / Else
func check_score():
    if score > 100:
        print("High score!")
    elif score == 100:
        print("Exactly 100!")
    else:
        print("Keep trying!")

# Loops
func print_numbers():
    for i in range(5):
        print(i)

    var i = 0
    while i < 5:
        print(i)
        i += 1

# Arrays and Dictionaries
var items = ["sword", "shield", "potion"]
var stats = {"health": 100, "mana": 50}

# Accessing
func show_inventory():
    for item in items:
        print(item)
    print(stats["health"])

# Classes and Objects
class_name Player
extends Node2D

var health: int = 100

func take_damage(amount: int):
    health -= amount
    print("Health:", health)

# Signals
signal hit(damage)

func _on_Hitbox_area_entered(area):
    emit_signal("hit", 10)

# Input
func _input(event):
    if event.is_action_pressed("ui_accept"):
        print("Action accepted")

# Physics process
func _physics_process(delta: float) -> void:
    position.x += 100 * delta

# Animation
onready var anim = $AnimationPlayer

func play_anim(name: String):
    anim.play(name)

# Scene instancing
func spawn_enemy():
    var enemy_scene = preload("res://Enemy.tscn")
    var enemy = enemy_scene.instantiate()
    add_child(enemy)

# Timers
func start_timer():
    var timer = Timer.new()
    timer.wait_time = 1.0
    timer.one_shot = true
    add_child(timer)
    timer.start()

    timer.timeout.connect(_on_timer_timeout)

func _on_timer_timeout():
    print("Timer ended!")

# Match (Pattern Matching)
func test_match(value):
    match value:
        1:
            print("One")
        "hello":
            print("Greeting")
        _:
            print("Something else")

# Tool script (runs in editor)
tool
extends Node2D

func _process(delta):
    print("Running in the editor")

# Export variables (visible in editor)
@export var speed: float = 200.0
@export var player_color: Color = Color(1, 0, 0)

# Groups
func _ready():
    if is_in_group("enemies"):
        print("I'm an enemy!")

# Coroutines (yield in Godot 3.x, await in 4.x)
func delayed_action():
    await get_tree().create_timer(1.0).timeout
    print("1 second passed")

# Type casting and checking
func check_type(value):
    if value is String:
        print("It’s a string")
