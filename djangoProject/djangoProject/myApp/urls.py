
from django.urls import path
from . import views

urlpatterns = [
    path("test/", views.index, name = "index"),
    path('completed/',views.show_completed,name= "completed"),
    path('<int:action_id>/', views.show_action, name='action'),
    path('update/', views.update_status, name="update_status"),
    path('new/', views.new_action,name = "new_action"),
]