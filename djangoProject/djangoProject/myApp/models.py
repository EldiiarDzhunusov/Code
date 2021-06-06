from django.db import models
from datetime import datetime

# Create your models here.
class Action(models.Model):
    name = models.CharField(max_length=20)
    create_date = models.DateTimeField(default= datetime.now())
    CHOICES = [
        ("C", "Completed")
             ,("N", "Not Completed"),
    ("I", "In Progress"),
    ]
    status = models.CharField(max_length=1, choices=CHOICES, default="N");


